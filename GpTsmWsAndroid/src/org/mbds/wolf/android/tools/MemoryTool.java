package org.mbds.wolf.android.tools;

import java.io.File;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

/* 
 * Adapted from source code provided at: 
 * http://stackoverflow.com/questions/8133417/android-get-free-size-of-internal-external-memory
 */
public class MemoryTool {
	private Context context;

	public MemoryTool(Context context) {
		this.context = context;
	}
	
	public static boolean isExternalMemoryAvailable() {
        return android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED);
    }
	
	public static long bytesToMegaBytes(long bytes) {
		return bytes / (1024 * 1024);
	}

	public long getTotalRAMBytes() {
		ActivityManager actManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		MemoryInfo memInfo = new ActivityManager.MemoryInfo();
		actManager.getMemoryInfo(memInfo);
		return memInfo.availMem * 1024 * 1024;
	}
	public long getAvailableRAMBytes() {
		ActivityManager actManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		MemoryInfo memInfo = new ActivityManager.MemoryInfo();
		actManager.getMemoryInfo(memInfo);
		return memInfo.totalMem * 1024 * 1024;
	}
	
    public static long getAvailableInternalMemoryBytes() {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        return stat.getAvailableBytes();
    }

    public static long getTotalInternalMemoryBytes() {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        return stat.getTotalBytes();
    }

    public static long getAvailableExternalMemoryBytes() {
        if (isExternalMemoryAvailable()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs stat = new StatFs(path.getPath());
            return stat.getAvailableBytes();
        } else {
            return 0;
        }
    }

    public static long getTotalExternalMemoryBytes() {
        if (isExternalMemoryAvailable()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs stat = new StatFs(path.getPath());
            return stat.getTotalBytes();
        } else {
            return 0;
        }
    }

    public static String formatSize(long size) {
        String suffix = null;

        if (size >= 1024) {
            suffix = "KB";
            size /= 1024;
            if (size >= 1024) {
                suffix = "MB";
                size /= 1024;
            }
        }

        StringBuilder resultBuffer = new StringBuilder(Long.toString(size));

        int commaOffset = resultBuffer.length() - 3;
        while (commaOffset > 0) {
            resultBuffer.insert(commaOffset, ',');
            commaOffset -= 3;
        }

        if (suffix != null) resultBuffer.append(suffix);
        return resultBuffer.toString();
    }
}
