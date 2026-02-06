package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Ct  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0667Ct implements InterfaceC1639gA {
    public static byte[] A01;
    public final InterfaceC1640gB A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, C2638Cg0.q7, 3, 2, C2638Cg0.E7, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC0667Ct(InterfaceC1640gB interfaceC1640gB) {
        this.A00 = interfaceC1640gB;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final boolean ADs(C1637g8 c1637g8) {
        InterfaceC1623fu A00 = c1637g8.A00();
        if (this.A00.AAZ()) {
            Log.e(AbstractC0667Ct.class.getSimpleName(), A00(14, 27, 123), c1637g8);
        }
        if (A00 != null && A00.A9C() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final HttpURLConnection AGl(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final InputStream AGm(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final void AH6(HttpURLConnection httpURLConnection, EnumC1635g6 enumC1635g6, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1635g6.A03());
        httpURLConnection.setDoOutput(enumC1635g6.A05());
        httpURLConnection.setDoInput(enumC1635g6.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final byte[] AHT(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1639gA
    public final void AL8(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
