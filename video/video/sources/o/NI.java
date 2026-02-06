package o;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes4.dex */
public class NI extends M0 implements Serializable {
    public static final Comparator<?>[] Y = new Comparator[0];
    private static final long serialVersionUID = -2224170307287243428L;
    public final Comparator<File>[] X;

    public NI(Comparator<File>... comparatorArr) {
        this.X = comparatorArr == null ? g() : (Comparator[]) comparatorArr.clone();
    }

    public static /* synthetic */ boolean c(Integer num) {
        if (num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Comparator[] d(int i) {
        return new Comparator[i];
    }

    public static /* synthetic */ Integer e(File file, File file2, Comparator comparator) {
        return Integer.valueOf(comparator.compare(file, file2));
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ List a(List list) {
        return super.a(list);
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ File[] b(File[] fileArr) {
        return super.b(fileArr);
    }

    @Override // java.util.Comparator
    /* renamed from: f */
    public int compare(final File file, final File file2) {
        return ((Integer) Stream.of((Object[]) this.X).map(new Function() { // from class: o.LI
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NI.e(file, file2, (Comparator) obj);
            }
        }).filter(new Predicate() { // from class: o.MI
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NI.c((Integer) obj);
            }
        }).findFirst().orElse(0)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Comparator<java.io.File>[], java.util.Comparator<?>[]] */
    public final Comparator<File>[] g() {
        return Y;
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + Arrays.toString(this.X);
    }

    public NI(Iterable<Comparator<File>> iterable) {
        Comparator<File>[] comparatorArr;
        if (iterable == null) {
            comparatorArr = g();
        } else {
            comparatorArr = (Comparator[]) StreamSupport.stream(iterable.spliterator(), false).toArray(new IntFunction() { // from class: o.KI
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return NI.d(i);
                }
            });
        }
        this.X = comparatorArr;
    }
}
