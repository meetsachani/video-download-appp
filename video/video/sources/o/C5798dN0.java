package o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: o.dN0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5798dN0 extends Property<ImageView, Matrix> {
    public final Matrix a;

    public C5798dN0() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    @InterfaceC5670cr1
    /* renamed from: a */
    public Matrix get(@InterfaceC5670cr1 ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
