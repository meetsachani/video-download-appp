package o;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o.Os  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3871Os extends AbstractC6190f0 {
    public final UI0 Z0;

    public C3871Os(Writer writer, UI0 ui0, String str) {
        super(writer, str);
        this.Z0 = ui0;
    }

    @Override // o.AbstractC6190f0
    public void f(String[] strArr, boolean z, Appendable appendable) throws IOException {
        appendable.append(this.Z0.f(strArr, z));
        appendable.append(this.Y);
        this.X.write(appendable.toString());
    }
}
