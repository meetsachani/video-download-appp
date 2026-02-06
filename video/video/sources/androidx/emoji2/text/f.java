package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.C10907yF1;
import o.C11074yw2;
import o.C6123ej1;
import o.C6366fj1;
import o.C7139ir2;

/* loaded from: classes.dex */
public final class f {
    public static final int e = 1024;
    public static final String f = "EmojiCompat.MetadataRepo.create";
    public final C6123ej1 a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    /* loaded from: classes.dex */
    public static class a {
        public final SparseArray<a> a;
        public C11074yw2 b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final C11074yw2 b() {
            return this.b;
        }

        public void c(C11074yw2 c11074yw2, int i, int i2) {
            a a = a(c11074yw2.b(i));
            if (a == null) {
                a = new a();
                this.a.put(c11074yw2.b(i), a);
            }
            if (i2 > i) {
                a.c(c11074yw2, i + 1, i2);
            } else {
                a.b = c11074yw2;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    public f(Typeface typeface, C6123ej1 c6123ej1) {
        this.d = typeface;
        this.a = c6123ej1;
        this.b = new char[c6123ej1.K() * 2];
        a(c6123ej1);
    }

    public static f b(AssetManager assetManager, String str) throws IOException {
        try {
            C7139ir2.b(f);
            return new f(Typeface.createFromAsset(assetManager, str), C6366fj1.b(assetManager, str));
        } finally {
            C7139ir2.d();
        }
    }

    public static f c(Typeface typeface) {
        try {
            C7139ir2.b(f);
            return new f(typeface, new C6123ej1());
        } finally {
            C7139ir2.d();
        }
    }

    public static f d(Typeface typeface, InputStream inputStream) throws IOException {
        try {
            C7139ir2.b(f);
            return new f(typeface, C6366fj1.c(inputStream));
        } finally {
            C7139ir2.d();
        }
    }

    public static f e(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            C7139ir2.b(f);
            return new f(typeface, C6366fj1.d(byteBuffer));
        } finally {
            C7139ir2.d();
        }
    }

    public final void a(C6123ej1 c6123ej1) {
        int K = c6123ej1.K();
        for (int i = 0; i < K; i++) {
            C11074yw2 c11074yw2 = new C11074yw2(this, i);
            Character.toChars(c11074yw2.g(), this.b, i * 2);
            k(c11074yw2);
        }
    }

    public char[] f() {
        return this.b;
    }

    public C6123ej1 g() {
        return this.a;
    }

    public int h() {
        return this.a.S();
    }

    public a i() {
        return this.c;
    }

    public Typeface j() {
        return this.d;
    }

    public void k(C11074yw2 c11074yw2) {
        boolean z;
        C10907yF1.m(c11074yw2, "emoji metadata cannot be null");
        if (c11074yw2.c() > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "invalid metadata codepoint length");
        this.c.c(c11074yw2, 0, c11074yw2.c() - 1);
    }
}
