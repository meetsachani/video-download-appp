package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.qY0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9025qY0 extends M0 implements Serializable {
    public static final Comparator<File> X;
    public static final Comparator<File> Y;
    private static final long serialVersionUID = 7372168004395734046L;

    static {
        C9025qY0 c9025qY0 = new C9025qY0();
        X = c9025qY0;
        Y = new BU1(c9025qY0);
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
    /* renamed from: c */
    public int compare(File file, File file2) {
        int i = ((C3961Pq0.e1(file) - C3961Pq0.e1(file2)) > 0L ? 1 : ((C3961Pq0.e1(file) - C3961Pq0.e1(file2)) == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
