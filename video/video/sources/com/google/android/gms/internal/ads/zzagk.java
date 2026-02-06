package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzagk {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public zzagk() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(zzagj zzagjVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.b;
            b(dataOutputStream, zzagjVar.a);
            b(dataOutputStream, zzagjVar.b);
            dataOutputStream.writeLong(zzagjVar.c);
            dataOutputStream.writeLong(zzagjVar.d);
            dataOutputStream.write(zzagjVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
