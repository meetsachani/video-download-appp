package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import o.FN1;

/* loaded from: classes3.dex */
class CrossProcessLock {
    public static final String c = "CrossProcessLock";
    public final FileChannel a;
    public final FileLock b;

    public CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CrossProcessLock a(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), FN1.c1).getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new CrossProcessLock(fileChannel, fileLock);
                } catch (IOException e) {
                    e = e;
                    Log.e(c, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e(c, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e(c, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            fileChannel = null;
            fileLock = null;
        }
    }

    public void b() {
        try {
            this.b.release();
            this.a.close();
        } catch (IOException e) {
            Log.e(c, "encountered error while releasing, ignoring", e);
        }
    }
}
