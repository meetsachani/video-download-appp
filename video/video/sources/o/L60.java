package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class L60<T extends Drawable> implements InterfaceC5580cT1<T>, DP0 {
    public final T X;

    public L60(T t) {
        this.X = (T) C10175vF1.e(t);
    }

    @Override // o.InterfaceC5580cT1
    /* renamed from: b */
    public final T get() {
        Drawable.ConstantState constantState = this.X.getConstantState();
        if (constantState == null) {
            return this.X;
        }
        return (T) constantState.newDrawable();
    }

    @Override // o.DP0
    public void initialize() {
        T t = this.X;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C7468kD0) {
            ((C7468kD0) t).g().prepareToDraw();
        }
    }
}
