package o;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class FQ1 implements InterfaceC4942Zp2<CharSequence> {
    public static final Pattern a = Pattern.compile("(\\w)+");

    @Override // o.InterfaceC4942Zp2
    /* renamed from: b */
    public CharSequence[] a(CharSequence charSequence) {
        C11147zE2.B(C4500Ve2.M0(charSequence), "Invalid text", new Object[0]);
        Matcher matcher = a.matcher(charSequence);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(0));
        }
        return (CharSequence[]) arrayList.toArray(C4206Se.u);
    }
}
