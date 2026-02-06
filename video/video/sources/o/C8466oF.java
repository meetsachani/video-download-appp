package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.oF */
/* loaded from: classes3.dex */
public class C8466oF extends C8222nF {

    /* renamed from: o.oF$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, GW0 {
        public final /* synthetic */ FA0<Iterator<T>> X;

        /* JADX WARN: Multi-variable type inference failed */
        public a(FA0<? extends Iterator<? extends T>> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.X.invoke();
        }
    }

    @XP0
    public static final <T> Iterable<T> a0(FA0<? extends Iterator<? extends T>> fa0) {
        C6562gT0.p(fa0, "iterator");
        return new a(fa0);
    }

    @HK1
    public static <T> int b0(@NotNull Iterable<? extends T> iterable, int i) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    @HK1
    @Nullable
    public static final <T> Integer c0(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> d0(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        C6562gT0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            C9444sF.q0(arrayList, iterable2);
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> C4180Rx1<List<T>, List<R>> e0(@NotNull Iterable<? extends C4180Rx1<? extends T, ? extends R>> iterable) {
        C6562gT0.p(iterable, "<this>");
        int b0 = b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b0);
        ArrayList arrayList2 = new ArrayList(b0);
        for (C4180Rx1<? extends T, ? extends R> c4180Rx1 : iterable) {
            arrayList.add(c4180Rx1.e());
            arrayList2.add(c4180Rx1.f());
        }
        return C6670gv2.a(arrayList, arrayList2);
    }
}
