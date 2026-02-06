package o;

import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public final class Y82 implements X82 {
    public static final X82 b2 = new Y82();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (C6504gE2.l(annotationArr, X82.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = b2;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return X82.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof X82;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + X82.class.getName() + "()";
    }
}
