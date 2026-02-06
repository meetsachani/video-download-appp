package o;

import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DH2
/* loaded from: classes.dex */
public final class PP0 {
    public final List<EH2<?>> a = new ArrayList();

    public final <T extends CH2> void a(AW0<T> aw0, HA0<? super AbstractC6553gR, ? extends T> ha0) {
        C6562gT0.p(aw0, "clazz");
        C6562gT0.p(ha0, "initializer");
        this.a.add(new EH2<>(C6074eW0.e(aw0), ha0));
    }

    public final u.b b() {
        EH2[] eh2Arr = (EH2[]) this.a.toArray(new EH2[0]);
        return new OP0((EH2[]) Arrays.copyOf(eh2Arr, eh2Arr.length));
    }
}
