package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.pf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8810pf2 extends C8567of2 {
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder A0(StringBuilder sb, boolean z) {
        C6562gT0.p(sb, "<this>");
        sb.append(z);
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder B0(StringBuilder sb, char[] cArr) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "value");
        sb.append(cArr);
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final String C0(int i, HA0<? super StringBuilder, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        ha0.invoke(sb);
        return sb.toString();
    }

    @XP0
    public static final String D0(HA0<? super StringBuilder, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        StringBuilder sb = new StringBuilder();
        ha0.invoke(sb);
        return sb.toString();
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Use append(value: Any?) instead", replaceWith = @IR1(expression = "append(value = obj)", imports = {}))
    public static final StringBuilder r0(StringBuilder sb, Object obj) {
        C6562gT0.p(sb, "<this>");
        sb.append(obj);
        return sb;
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use appendRange instead.", replaceWith = @IR1(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    public static final StringBuilder s0(StringBuilder sb, char[] cArr, int i, int i2) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "str");
        throw new C9592sr1(null, 1, null);
    }

    @NotNull
    public static final StringBuilder t0(@NotNull StringBuilder sb, @NotNull Object... objArr) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @NotNull
    public static final StringBuilder u0(@NotNull StringBuilder sb, @NotNull String... strArr) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder v0(StringBuilder sb) {
        C6562gT0.p(sb, "<this>");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder w0(StringBuilder sb, char c) {
        C6562gT0.p(sb, "<this>");
        sb.append(c);
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder x0(StringBuilder sb, CharSequence charSequence) {
        C6562gT0.p(sb, "<this>");
        sb.append(charSequence);
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder y0(StringBuilder sb, Object obj) {
        C6562gT0.p(sb, "<this>");
        sb.append(obj);
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder z0(StringBuilder sb, String str) {
        C6562gT0.p(sb, "<this>");
        sb.append(str);
        sb.append('\n');
        return sb;
    }
}
