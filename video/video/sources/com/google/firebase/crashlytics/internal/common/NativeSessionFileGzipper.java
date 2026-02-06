package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class NativeSessionFileGzipper {
    public static void a(@InterfaceC11300zs1 InputStream inputStream, @InterfaceC5670cr1 File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        CommonUtils.g(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List<NativeSessionFile> list) {
        for (NativeSessionFile nativeSessionFile : list) {
            InputStream inputStream = null;
            try {
                inputStream = nativeSessionFile.e();
                if (inputStream != null) {
                    a(inputStream, new File(file, nativeSessionFile.g()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.g(null);
                throw th;
            }
            CommonUtils.g(inputStream);
        }
    }
}
