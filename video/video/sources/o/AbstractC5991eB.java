package o;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.Locale;

/* renamed from: o.eB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5991eB {
    public static final char[] a = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F'};

    public static String a(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    public abstract int b(CharSequence charSequence, int i, Writer writer) throws IOException;

    public final String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            d(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public final void d(CharSequence charSequence, Writer writer) throws IOException {
        boolean z;
        if (writer != null) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "The Writer must not be null", new Object[0]);
        if (charSequence != null) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int b = b(charSequence, i, writer);
                if (b == 0) {
                    char charAt = charSequence.charAt(i);
                    writer.write(charAt);
                    int i2 = i + 1;
                    if (Character.isHighSurrogate(charAt) && i2 < length) {
                        char charAt2 = charSequence.charAt(i2);
                        if (Character.isLowSurrogate(charAt2)) {
                            writer.write(charAt2);
                            i += 2;
                        }
                    }
                    i = i2;
                } else {
                    for (int i3 = 0; i3 < b; i3++) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                    }
                }
            }
        }
    }

    public final AbstractC5991eB e(AbstractC5991eB... abstractC5991eBArr) {
        AbstractC5991eB[] abstractC5991eBArr2 = new AbstractC5991eB[abstractC5991eBArr.length + 1];
        abstractC5991eBArr2[0] = this;
        System.arraycopy(abstractC5991eBArr, 0, abstractC5991eBArr2, 1, abstractC5991eBArr.length);
        return new C6720h8(abstractC5991eBArr2);
    }
}
