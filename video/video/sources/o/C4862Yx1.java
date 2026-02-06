package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@InterfaceC5359ba0
@InterfaceC4238Sm
/* renamed from: o.Yx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4862Yx1 implements AnnotatedElement {
    public final AbstractC11205zT0<?, ?> X;
    public final int Y;
    public final AbstractC5317bO0<Annotation> Y0;
    public final Pv2<?> Z;

    public C4862Yx1(AbstractC11205zT0<?, ?> abstractC11205zT0, int i, Pv2<?> pv2, Annotation[] annotationArr) {
        this.X = abstractC11205zT0;
        this.Y = i;
        this.Z = pv2;
        this.Y0 = AbstractC5317bO0.H(annotationArr);
    }

    public AbstractC11205zT0<?, ?> a() {
        return this.X;
    }

    public Pv2<?> b() {
        return this.Z;
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof C4862Yx1) {
            C4862Yx1 c4862Yx1 = (C4862Yx1) obj;
            if (this.Y == c4862Yx1.Y && this.X.equals(c4862Yx1.X)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @MB
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        C10664xF1.E(cls);
        AbstractC6237fB2<Annotation> it = this.Y0.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @MB
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        C10664xF1.E(cls);
        return (A) AbstractC10343vw0.J(this.Y0).D(cls).G().j();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.Y0.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) AbstractC10343vw0.J(this.Y0).D(cls).d0(cls));
    }

    public int hashCode() {
        return this.Y;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        if (getAnnotation(cls) != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(this.Z);
        int i = this.Y;
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append(valueOf);
        sb.append(" arg");
        sb.append(i);
        return sb.toString();
    }
}
