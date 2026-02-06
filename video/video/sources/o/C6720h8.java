package o;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.h8  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6720h8 extends AbstractC5991eB {
    public final List<AbstractC5991eB> b;

    public C6720h8(AbstractC5991eB... abstractC5991eBArr) {
        final ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (abstractC5991eBArr != null) {
            Stream.of((Object[]) abstractC5991eBArr).filter(new Predicate() { // from class: o.f8
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((AbstractC5991eB) obj);
                }
            }).forEach(new Consumer() { // from class: o.g8
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add((AbstractC5991eB) obj);
                }
            });
        }
    }

    @Override // o.AbstractC5991eB
    public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (AbstractC5991eB abstractC5991eB : this.b) {
            int b = abstractC5991eB.b(charSequence, i, writer);
            if (b != 0) {
                return b;
            }
        }
        return 0;
    }
}
