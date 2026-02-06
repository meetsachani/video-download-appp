package o;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

/* renamed from: o.eg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6109eg {
    public static final byte[] a(AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static final String b(AtomicFile atomicFile, Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        return b(atomicFile, charset);
    }

    public static final void d(AtomicFile atomicFile, HA0<? super FileOutputStream, C7458kA2> ha0) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            ha0.invoke(startWrite);
            UP0.d(1);
            atomicFile.finishWrite(startWrite);
            UP0.c(1);
        } catch (Throwable th) {
            UP0.d(1);
            atomicFile.failWrite(startWrite);
            UP0.c(1);
            throw th;
        }
    }

    public static final void e(AtomicFile atomicFile, byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void f(AtomicFile atomicFile, String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        f(atomicFile, str, charset);
    }
}
