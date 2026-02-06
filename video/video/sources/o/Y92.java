package o;

import java.util.Comparator;
import java.util.Iterator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public interface Y92<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
