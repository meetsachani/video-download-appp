package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void a(@InterfaceC10571ws1 ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    public static void b(@InterfaceC10571ws1 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long c(@InterfaceC5670cr1 InputStream inputStream, @InterfaceC5670cr1 OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, false, 1024);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long d(@InterfaceC5670cr1 InputStream inputStream, @InterfaceC5670cr1 OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            b(inputStream);
            b(outputStream);
        }
        return j;
    }

    @KeepForSdk
    public static boolean e(@InterfaceC5670cr1 byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static byte[] f(@InterfaceC5670cr1 InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static byte[] g(@InterfaceC5670cr1 InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static byte[] h(@InterfaceC5670cr1 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.r(inputStream);
        Preconditions.r(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
