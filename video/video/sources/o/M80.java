package o;

/* loaded from: classes2.dex */
public final /* synthetic */ class M80 {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb.append(charSequence);
                    sb.append(charSequenceArr[i]);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException(C5445bv2.b0);
    }
}
