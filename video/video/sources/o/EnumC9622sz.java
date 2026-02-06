package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.sz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC9622sz {
    public final SA X;
    public final String Y;
    public static final EnumC9622sz Z = new a("LOWER_HYPHEN", 0, SA.q('-'), "-");
    public static final EnumC9622sz Y0 = new EnumC9622sz("LOWER_UNDERSCORE", 1, SA.q('_'), CrashlyticsReportPersistence.m) { // from class: o.sz.b
        @Override // o.EnumC9622sz
        public String h(EnumC9622sz enumC9622sz, String str) {
            if (enumC9622sz == EnumC9622sz.Z) {
                return str.replace('_', '-');
            }
            if (enumC9622sz == EnumC9622sz.b1) {
                return C8077mf.j(str);
            }
            return super.h(enumC9622sz, str);
        }

        @Override // o.EnumC9622sz
        public String m(String str) {
            return C8077mf.g(str);
        }
    };
    public static final EnumC9622sz Z0 = new EnumC9622sz("LOWER_CAMEL", 2, SA.m('A', 'Z'), "") { // from class: o.sz.c
        @Override // o.EnumC9622sz
        public String l(String str) {
            return C8077mf.g(str);
        }

        @Override // o.EnumC9622sz
        public String m(String str) {
            return EnumC9622sz.j(str);
        }
    };
    public static final EnumC9622sz a1 = new EnumC9622sz("UPPER_CAMEL", 3, SA.m('A', 'Z'), "") { // from class: o.sz.d
        @Override // o.EnumC9622sz
        public String m(String str) {
            return EnumC9622sz.j(str);
        }
    };
    public static final EnumC9622sz b1 = new EnumC9622sz("UPPER_UNDERSCORE", 4, SA.q('_'), CrashlyticsReportPersistence.m) { // from class: o.sz.e
        @Override // o.EnumC9622sz
        public String h(EnumC9622sz enumC9622sz, String str) {
            if (enumC9622sz == EnumC9622sz.Z) {
                return C8077mf.g(str.replace('_', '-'));
            }
            if (enumC9622sz == EnumC9622sz.Y0) {
                return C8077mf.g(str);
            }
            return super.h(enumC9622sz, str);
        }

        @Override // o.EnumC9622sz
        public String m(String str) {
            return C8077mf.j(str);
        }
    };
    public static final /* synthetic */ EnumC9622sz[] c1 = e();

    /* renamed from: o.sz$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC9622sz {
        public a(String str, int i, SA sa, String str2) {
            super(str, i, sa, str2, null);
        }

        @Override // o.EnumC9622sz
        public String h(EnumC9622sz enumC9622sz, String str) {
            if (enumC9622sz == EnumC9622sz.Y0) {
                return str.replace('-', '_');
            }
            if (enumC9622sz == EnumC9622sz.b1) {
                return C8077mf.j(str.replace('-', '_'));
            }
            return super.h(enumC9622sz, str);
        }

        @Override // o.EnumC9622sz
        public String m(String str) {
            return C8077mf.g(str);
        }
    }

    /* renamed from: o.sz$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC7264jN<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumC9622sz Y0;
        public final EnumC9622sz Z;

        public f(EnumC9622sz enumC9622sz, EnumC9622sz enumC9622sz2) {
            this.Z = (EnumC9622sz) C10664xF1.E(enumC9622sz);
            this.Y0 = (EnumC9622sz) C10664xF1.E(enumC9622sz2);
        }

        @Override // o.AbstractC7264jN, o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.Z.equals(fVar.Z) && this.Y0.equals(fVar.Y0)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.Z.hashCode() ^ this.Y0.hashCode();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(String str) {
            return this.Y0.n(this.Z, str);
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public String h(String str) {
            return this.Z.n(this.Y0, str);
        }

        public String toString() {
            String valueOf = String.valueOf(this.Z);
            String valueOf2 = String.valueOf(this.Y0);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    public /* synthetic */ EnumC9622sz(String str, int i, SA sa, String str2, a aVar) {
        this(str, i, sa, str2);
    }

    public static /* synthetic */ EnumC9622sz[] e() {
        return new EnumC9622sz[]{Z, Y0, Z0, a1, b1};
    }

    public static String j(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char h = C8077mf.h(str.charAt(0));
        String g = C8077mf.g(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 1);
        sb.append(h);
        sb.append(g);
        return sb.toString();
    }

    public static EnumC9622sz valueOf(String str) {
        return (EnumC9622sz) Enum.valueOf(EnumC9622sz.class, str);
    }

    public static EnumC9622sz[] values() {
        return (EnumC9622sz[]) c1.clone();
    }

    public String h(EnumC9622sz enumC9622sz, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.X.o(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (enumC9622sz.Y.length() * 4));
                sb.append(enumC9622sz.l(str.substring(i, i2)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(enumC9622sz.m(str.substring(i, i2)));
            }
            sb.append(enumC9622sz.Y);
            i = this.Y.length() + i2;
        }
        if (i == 0) {
            return enumC9622sz.l(str);
        }
        Objects.requireNonNull(sb);
        sb.append(enumC9622sz.m(str.substring(i)));
        return sb.toString();
    }

    public AbstractC7264jN<String, String> i(EnumC9622sz enumC9622sz) {
        return new f(this, enumC9622sz);
    }

    public String l(String str) {
        return m(str);
    }

    public abstract String m(String str);

    public final String n(EnumC9622sz enumC9622sz, String str) {
        C10664xF1.E(enumC9622sz);
        C10664xF1.E(str);
        if (enumC9622sz == this) {
            return str;
        }
        return h(enumC9622sz, str);
    }

    public EnumC9622sz(String str, int i, SA sa, String str2) {
        this.X = sa;
        this.Y = str2;
    }
}
