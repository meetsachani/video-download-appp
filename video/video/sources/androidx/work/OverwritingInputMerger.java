package androidx.work;

import androidx.work.b;
import java.util.HashMap;
import java.util.List;
import o.AbstractC7036iQ0;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC7036iQ0 {
    @Override // o.AbstractC7036iQ0
    public b b(List<b> inputs) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : inputs) {
            hashMap.putAll(bVar.x());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
