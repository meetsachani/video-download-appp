package o;

import java.util.Enumeration;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.pF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8709pF extends C8466oF {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.pF$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterator<T>, GW0 {
        public final /* synthetic */ Enumeration<T> X;

        public a(Enumeration<T> enumeration) {
            this.X = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.X.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static <T> Iterator<T> f0(@NotNull Enumeration<T> enumeration) {
        C6562gT0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
