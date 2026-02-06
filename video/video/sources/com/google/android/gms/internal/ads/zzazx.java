package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzazx {
    @InterfaceC5056aJ2
    public ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    @InterfaceC5056aJ2
    public Base64OutputStream b = new Base64OutputStream(this.a, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.b.close();
        } catch (IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.a.close();
                str = this.a.toString();
            } catch (IOException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
