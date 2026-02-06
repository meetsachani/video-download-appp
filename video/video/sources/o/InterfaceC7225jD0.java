package o;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* renamed from: o.jD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7225jD0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;

    /* renamed from: o.jD0$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        byte[] b(int i);

        Bitmap c(int i, int i2, Bitmap.Config config);

        int[] d(int i);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jD0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    int a(InputStream inputStream, int i);

    Bitmap b();

    void c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    int f(int i);

    int g();

    ByteBuffer getData();

    int getHeight();

    int getWidth();

    int h();

    @Deprecated
    int i();

    int j();

    void k(C9437sD0 c9437sD0, ByteBuffer byteBuffer, int i);

    void l();

    void m(C9437sD0 c9437sD0, byte[] bArr);

    int n();

    void o(C9437sD0 c9437sD0, ByteBuffer byteBuffer);

    int p();

    int q();

    int read(byte[] bArr);
}
