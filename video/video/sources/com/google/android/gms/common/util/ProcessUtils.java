package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import o.InterfaceC10571ws1;
import o.InterfaceC11300zs1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ProcessUtils {
    @InterfaceC10571ws1
    public static String a;
    public static int b;

    private ProcessUtils() {
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static String a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                a = processName;
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        str = "/proc/" + i + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            Preconditions.r(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            IOUtils.b(bufferedReader2);
                            throw th;
                        }
                        IOUtils.b(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                a = str2;
            }
        }
        return a;
    }
}
