package o;

/* loaded from: classes3.dex */
public final class AW1 extends TT1 {
    @Override // o.TT1
    /* renamed from: q */
    public C11216zW1 k(QT1 qt1) {
        String str;
        String c = TT1.c(qt1);
        if (!c.startsWith("smsto:") && !c.startsWith("SMSTO:") && !c.startsWith("mmsto:") && !c.startsWith("MMSTO:")) {
            return null;
        }
        String substring = c.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C11216zW1(substring, (String) null, (String) null, str);
    }
}
