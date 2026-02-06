package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class BytesBackedNativeSessionFile implements NativeSessionFile {
    @InterfaceC11300zs1
    public final byte[] a;
    @InterfaceC5670cr1
    public final String b;
    @InterfaceC5670cr1
    public final String c;

    public BytesBackedNativeSessionFile(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    @InterfaceC11300zs1
    public final byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean b() {
        byte[] bArr = this.a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC11300zs1
    public InputStream e() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC11300zs1
    public CrashlyticsReport.FilesPayload.File f() {
        byte[] a = a();
        if (a == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.a().b(a).c(this.b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @InterfaceC5670cr1
    public String g() {
        return this.c;
    }
}
