package o;

/* renamed from: o.My1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3697My1 {
    public final EnumC3795Ny1 a;

    public AbstractC3697My1(EnumC3795Ny1 enumC3795Ny1) {
        this.a = enumC3795Ny1;
    }

    public static void c(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str);
        }
    }

    public static void d(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                c(str, sb);
            }
        }
    }

    public abstract String a();

    public final EnumC3795Ny1 b() {
        return this.a;
    }

    public final String toString() {
        return a();
    }
}
