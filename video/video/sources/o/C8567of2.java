package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* renamed from: o.of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8567of2 extends C8323nf2 {
    @XP0
    @InterfaceC6480g82(version = "1.9")
    public static final StringBuilder C(StringBuilder sb, byte b) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) b);
        C6562gT0.o(sb, "append(...)");
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    public static final StringBuilder D(StringBuilder sb, short s) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) s);
        C6562gT0.o(sb, "append(...)");
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder E(StringBuilder sb, byte b) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) b);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder F(StringBuilder sb, double d) {
        C6562gT0.p(sb, "<this>");
        sb.append(d);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder G(StringBuilder sb, float f) {
        C6562gT0.p(sb, "<this>");
        sb.append(f);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder H(StringBuilder sb, int i) {
        C6562gT0.p(sb, "<this>");
        sb.append(i);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder I(StringBuilder sb, long j) {
        C6562gT0.p(sb, "<this>");
        sb.append(j);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder J(StringBuilder sb, StringBuffer stringBuffer) {
        C6562gT0.p(sb, "<this>");
        sb.append(stringBuffer);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder K(StringBuilder sb, StringBuilder sb2) {
        C6562gT0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder L(StringBuilder sb, short s) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) s);
        C6562gT0.o(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder M(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(charSequence, "value");
        sb.append(charSequence, i, i2);
        C6562gT0.o(sb, "append(...)");
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder N(StringBuilder sb, char[] cArr, int i, int i2) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "value");
        sb.append(cArr, i, i2 - i);
        C6562gT0.o(sb, "append(...)");
        return sb;
    }

    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine()", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    @NotNull
    public static final Appendable O(@NotNull Appendable appendable) {
        C6562gT0.p(appendable, "<this>");
        Appendable append = appendable.append(C2754Dk2.b);
        C6562gT0.o(append, "append(...)");
        return append;
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable P(Appendable appendable, char c) {
        C6562gT0.p(appendable, "<this>");
        Appendable append = appendable.append(c);
        C6562gT0.o(append, "append(...)");
        return O(append);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable Q(Appendable appendable, CharSequence charSequence) {
        C6562gT0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        C6562gT0.o(append, "append(...)");
        return O(append);
    }

    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine()", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    @NotNull
    public static final StringBuilder R(@NotNull StringBuilder sb) {
        C6562gT0.p(sb, "<this>");
        sb.append(C2754Dk2.b);
        C6562gT0.o(sb, "append(...)");
        return sb;
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder S(StringBuilder sb, byte b) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) b);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder T(StringBuilder sb, char c) {
        C6562gT0.p(sb, "<this>");
        sb.append(c);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder U(StringBuilder sb, double d) {
        C6562gT0.p(sb, "<this>");
        sb.append(d);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder V(StringBuilder sb, float f) {
        C6562gT0.p(sb, "<this>");
        sb.append(f);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder W(StringBuilder sb, int i) {
        C6562gT0.p(sb, "<this>");
        sb.append(i);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder X(StringBuilder sb, long j) {
        C6562gT0.p(sb, "<this>");
        sb.append(j);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder Y(StringBuilder sb, CharSequence charSequence) {
        C6562gT0.p(sb, "<this>");
        sb.append(charSequence);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder Z(StringBuilder sb, Object obj) {
        C6562gT0.p(sb, "<this>");
        sb.append(obj);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder a0(StringBuilder sb, String str) {
        C6562gT0.p(sb, "<this>");
        sb.append(str);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder b0(StringBuilder sb, StringBuffer stringBuffer) {
        C6562gT0.p(sb, "<this>");
        sb.append(stringBuffer);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder c0(StringBuilder sb, StringBuilder sb2) {
        C6562gT0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder d0(StringBuilder sb, short s) {
        C6562gT0.p(sb, "<this>");
        sb.append((int) s);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder e0(StringBuilder sb, boolean z) {
        C6562gT0.p(sb, "<this>");
        sb.append(z);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @XP0
    @InterfaceC9150r20(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @IR1(expression = "appendLine(value)", imports = {}))
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder f0(StringBuilder sb, char[] cArr) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "value");
        sb.append(cArr);
        C6562gT0.o(sb, "append(...)");
        return R(sb);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final StringBuilder g0(@NotNull StringBuilder sb) {
        C6562gT0.p(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder h0(StringBuilder sb, int i) {
        C6562gT0.p(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i);
        C6562gT0.o(deleteCharAt, "deleteCharAt(...)");
        return deleteCharAt;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder i0(StringBuilder sb, int i, int i2) {
        C6562gT0.p(sb, "<this>");
        StringBuilder delete = sb.delete(i, i2);
        C6562gT0.o(delete, "delete(...)");
        return delete;
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    public static final StringBuilder j0(StringBuilder sb, int i, byte b) {
        C6562gT0.p(sb, "<this>");
        StringBuilder insert = sb.insert(i, (int) b);
        C6562gT0.o(insert, "insert(...)");
        return insert;
    }

    @XP0
    @InterfaceC6480g82(version = "1.9")
    public static final StringBuilder k0(StringBuilder sb, int i, short s) {
        C6562gT0.p(sb, "<this>");
        StringBuilder insert = sb.insert(i, (int) s);
        C6562gT0.o(insert, "insert(...)");
        return insert;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder l0(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(charSequence, "value");
        StringBuilder insert = sb.insert(i, charSequence, i2, i3);
        C6562gT0.o(insert, "insert(...)");
        return insert;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder m0(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "value");
        StringBuilder insert = sb.insert(i, cArr, i2, i3 - i2);
        C6562gT0.o(insert, "insert(...)");
        return insert;
    }

    @XP0
    public static final void n0(StringBuilder sb, int i, char c) {
        C6562gT0.p(sb, "<this>");
        sb.setCharAt(i, c);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final StringBuilder o0(StringBuilder sb, int i, int i2, String str) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(str, "value");
        StringBuilder replace = sb.replace(i, i2, str);
        C6562gT0.o(replace, "replace(...)");
        return replace;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final void p0(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "destination");
        sb.getChars(i2, i3, cArr, i);
    }

    public static /* synthetic */ void q0(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        C6562gT0.p(sb, "<this>");
        C6562gT0.p(cArr, "destination");
        sb.getChars(i2, i3, cArr, i);
    }
}
