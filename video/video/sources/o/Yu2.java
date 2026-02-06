package o;

import android.util.SparseArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public interface Yu2 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;

    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        @InterfaceC11300zs1
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.a = i;
            this.b = str;
            if (list == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = unmodifiableList;
            this.d = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        SparseArray<Yu2> a();

        @InterfaceC11300zs1
        Yu2 b(int i, b bVar);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public static final int f = Integer.MIN_VALUE;
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public e(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void a() {
            int i;
            int i2 = this.d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.b;
            } else {
                i = i2 + this.c;
            }
            this.d = i;
            this.e = this.a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public final void d() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public e(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + RemoteSettings.i;
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a(C3012Fy1 c3012Fy1, int i) throws C3989Py1;

    void b();

    void c(C10071up2 c10071up2, InterfaceC4518Vj0 interfaceC4518Vj0, e eVar);
}
