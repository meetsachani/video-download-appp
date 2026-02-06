package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class BU1 extends M0 implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    public final Comparator<File> X;

    public BU1(Comparator<File> comparator) {
        Objects.requireNonNull(comparator, "delegate");
        this.X = comparator;
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(File file, File file2) {
        return this.X.compare(file2, file);
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + C6566gU0.f + this.X.toString() + C6566gU0.g;
    }
}
