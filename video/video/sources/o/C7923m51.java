package o;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
/* renamed from: o.m51  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7923m51 extends AbstractC6234fB {
    public final HashMap<String, String> b = new HashMap<>();
    public final HashSet<Character> c = new HashSet<>();
    public final int d;
    public final int e;

    public C7923m51(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        if (charSequenceArr != null) {
            int i3 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i = length < i ? length : i;
                if (length > i3) {
                    i3 = length;
                }
            }
            i2 = i3;
        }
        this.d = i;
        this.e = i2;
    }

    @Override // o.AbstractC6234fB
    public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            int i2 = this.e;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.d) {
                String str = this.b.get(charSequence.subSequence(i, i + i2).toString());
                if (str != null) {
                    writer.write(str);
                    return i2;
                }
                i2--;
            }
            return 0;
        }
        return 0;
    }
}
