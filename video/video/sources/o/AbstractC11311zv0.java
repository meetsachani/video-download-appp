package o;

import android.util.FloatProperty;

/* renamed from: o.zv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11311zv0<T> {
    public final String a;

    /* renamed from: o.zv0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC11311zv0<T> {
        public final /* synthetic */ FloatProperty b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.b = floatProperty;
        }

        @Override // o.AbstractC11311zv0
        public float b(T t) {
            return ((Float) this.b.get(t)).floatValue();
        }

        @Override // o.AbstractC11311zv0
        public void c(T t, float f) {
            this.b.setValue(t, f);
        }
    }

    public AbstractC11311zv0(String str) {
        this.a = str;
    }

    public static <T> AbstractC11311zv0<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t);

    public abstract void c(T t, float f);
}
