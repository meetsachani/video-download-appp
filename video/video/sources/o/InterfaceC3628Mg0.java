package o;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C6960i70;

@Deprecated
/* renamed from: o.Mg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3628Mg0 {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 1;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;

    /* renamed from: o.Mg0$a */
    /* loaded from: classes2.dex */
    public static final class a implements g {
        public final InterfaceC3628Mg0 a;

        public a(InterfaceC3628Mg0 interfaceC3628Mg0) {
            this.a = interfaceC3628Mg0;
        }

        @Override // o.InterfaceC3628Mg0.g
        public InterfaceC3628Mg0 a(UUID uuid) {
            this.a.a();
            return this.a;
        }
    }

    /* renamed from: o.Mg0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final int d = Integer.MIN_VALUE;
        public static final int e = 0;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;
        public static final int i = 4;
        public final byte[] a;
        public final String b;
        public final int c;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Mg0$b$a */
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public b(byte[] bArr, String str, int i2) {
            this.a = bArr;
            this.b = str;
            this.c = i2;
        }
    }

    /* renamed from: o.Mg0$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final byte[] b;

        public c(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }

        public byte[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: o.Mg0$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(InterfaceC3628Mg0 interfaceC3628Mg0, @InterfaceC11300zs1 byte[] bArr, int i, int i2, @InterfaceC11300zs1 byte[] bArr2);
    }

    /* renamed from: o.Mg0$e */
    /* loaded from: classes2.dex */
    public interface e {
        void a(InterfaceC3628Mg0 interfaceC3628Mg0, byte[] bArr, long j);
    }

    /* renamed from: o.Mg0$f */
    /* loaded from: classes2.dex */
    public interface f {
        void a(InterfaceC3628Mg0 interfaceC3628Mg0, byte[] bArr, List<c> list, boolean z);
    }

    /* renamed from: o.Mg0$g */
    /* loaded from: classes2.dex */
    public interface g {
        InterfaceC3628Mg0 a(UUID uuid);
    }

    /* renamed from: o.Mg0$h */
    /* loaded from: classes2.dex */
    public static final class h {
        public final byte[] a;
        public final String b;

        public h(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    void a();

    @InterfaceC11300zs1
    PersistableBundle b();

    void c(@InterfaceC11300zs1 d dVar);

    Map<String, String> d(byte[] bArr);

    void e(@InterfaceC11300zs1 e eVar);

    void f(@InterfaceC11300zs1 f fVar);

    void g();

    h h();

    byte[] i() throws MediaDrmException;

    void j(byte[] bArr, byte[] bArr2);

    void k(String str, String str2);

    void l(byte[] bArr) throws DeniedByServerException;

    int m();

    void n(String str, byte[] bArr);

    String o(String str);

    InterfaceC7280jR p(byte[] bArr) throws MediaCryptoException;

    boolean r(byte[] bArr, String str);

    void s(byte[] bArr);

    byte[] t(String str);

    @InterfaceC11300zs1
    byte[] u(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    b v(byte[] bArr, @InterfaceC11300zs1 List<C6960i70.b> list, int i, @InterfaceC11300zs1 HashMap<String, String> hashMap) throws NotProvisionedException;

    default void q(byte[] bArr, ND1 nd1) {
    }
}
