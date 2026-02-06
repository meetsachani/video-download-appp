package o;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o.cS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5574cS {
    public static final char a = ',';
    public static final char b = '\"';
    public static final String c;
    public static final String d;
    public static final char[] e;

    /* renamed from: o.cS$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC8927q82 {
        @Override // o.AbstractC8927q82, o.AbstractC5991eB
        public /* bridge */ /* synthetic */ int b(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.b(charSequence, i, writer);
        }

        @Override // o.AbstractC8927q82
        public void g(CharSequence charSequence, Writer writer) throws IOException {
            String charSequence2 = charSequence.toString();
            if (C4500Ve2.C(charSequence2, C5574cS.e)) {
                writer.write(charSequence2);
                return;
            }
            writer.write(34);
            writer.write(C4500Ve2.f2(charSequence2, C5574cS.c, C5574cS.d));
            writer.write(34);
        }
    }

    /* renamed from: o.cS$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC8927q82 {
        @Override // o.AbstractC8927q82, o.AbstractC5991eB
        public /* bridge */ /* synthetic */ int b(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.b(charSequence, i, writer);
        }

        @Override // o.AbstractC8927q82
        public void g(CharSequence charSequence, Writer writer) throws IOException {
            if (charSequence.charAt(0) == '\"' && charSequence.charAt(charSequence.length() - 1) == '\"') {
                String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                if (C4500Ve2.w(charSequence2, C5574cS.e)) {
                    writer.write(C4500Ve2.f2(charSequence2, C5574cS.d, C5574cS.c));
                    return;
                } else {
                    writer.write(charSequence2);
                    return;
                }
            }
            writer.write(charSequence.toString());
        }
    }

    static {
        String valueOf = String.valueOf('\"');
        c = valueOf;
        d = valueOf + valueOf;
        e = new char[]{',', '\"', C8206nB.d, '\n'};
    }
}
