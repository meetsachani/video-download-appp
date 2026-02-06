package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* renamed from: o.i8  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6963i8 extends AbstractC6234fB {
    public final AbstractC6234fB[] b;

    public C6963i8(AbstractC6234fB... abstractC6234fBArr) {
        this.b = (AbstractC6234fB[]) C4206Se.R(abstractC6234fBArr);
    }

    @Override // o.AbstractC6234fB
    public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (AbstractC6234fB abstractC6234fB : this.b) {
            int b = abstractC6234fB.b(charSequence, i, writer);
            if (b != 0) {
                return b;
            }
        }
        return 0;
    }
}
