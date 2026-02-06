package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class FileBackedNativeSessionFile implements NativeSessionFile {
    @InterfaceC5670cr1
    public final File a;
    @InterfaceC5670cr1
    public final String b;
    @InterfaceC5670cr1
    public final String c;

    public FileBackedNativeSessionFile(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    @InterfaceC11300zs1
    private byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream e = e();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (e == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (e != null) {
                    e.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = e.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        e.close();
                        return byteArray;
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC11300zs1
    public InputStream e() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC11300zs1
    public CrashlyticsReport.FilesPayload.File f() {
        byte[] a = a();
        if (a != null) {
            return CrashlyticsReport.FilesPayload.File.a().b(a).c(this.b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC5670cr1
    public String g() {
        return this.c;
    }
}
