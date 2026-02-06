package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

@Deprecated
/* renamed from: o.Ts1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4361Ts1 extends AbstractC6234fB {
    public final EnumSet<a> b;

    /* renamed from: o.Ts1$a */
    /* loaded from: classes4.dex */
    public enum a {
        semiColonRequired,
        semiColonOptional,
        errorIfNoSemiColon
    }

    public C4361Ts1(a... aVarArr) {
        if (aVarArr.length > 0) {
            this.b = EnumSet.copyOf((Collection) Arrays.asList(aVarArr));
        } else {
            this.b = EnumSet.copyOf((Collection) Collections.singletonList(a.semiColonRequired));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r8.charAt(r2) != ';') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        r0 = 1;
     */
    @Override // o.AbstractC6234fB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int parseInt;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char charAt = charSequence.charAt(i3);
            if (charAt != 'x' && charAt != 'X') {
                i2 = 0;
            } else {
                i3 = i + 3;
                if (i3 == length) {
                    return 0;
                }
                i2 = 1;
            }
            int i4 = i3;
            while (i4 < length && ((charSequence.charAt(i4) >= '0' && charSequence.charAt(i4) <= '9') || ((charSequence.charAt(i4) >= 'a' && charSequence.charAt(i4) <= 'f') || (charSequence.charAt(i4) >= 'A' && charSequence.charAt(i4) <= 'F')))) {
                i4++;
            }
            int i5 = 0;
            if (i5 == 0) {
                if (f(a.semiColonRequired)) {
                    return 0;
                }
                if (f(a.errorIfNoSemiColon)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                if (i2 != 0) {
                    parseInt = Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16);
                } else {
                    parseInt = Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10);
                }
                if (parseInt > 65535) {
                    char[] chars = Character.toChars(parseInt);
                    writer.write(chars[0]);
                    writer.write(chars[1]);
                } else {
                    writer.write(parseInt);
                }
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public boolean f(a aVar) {
        EnumSet<a> enumSet = this.b;
        if (enumSet != null && enumSet.contains(aVar)) {
            return true;
        }
        return false;
    }
}
