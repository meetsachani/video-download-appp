package o;

/* renamed from: o.rS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC9255rS1<T> implements Runnable {
    public final AbstractC5091aS1<T> X;

    public AbstractRunnableC9255rS1(AbstractC5091aS1<T> abstractC5091aS1) {
        this.X = abstractC5091aS1;
    }

    public int a(AbstractRunnableC9255rS1<?> abstractRunnableC9255rS1) {
        return this.X.compareTo(abstractRunnableC9255rS1.X);
    }
}
