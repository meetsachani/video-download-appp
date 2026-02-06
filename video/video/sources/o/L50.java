package o;

import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class L50 extends FutureTask<RunnableC6713h60> implements Comparable<L50> {
    public final RunnableC6713h60 X;

    public L50(RunnableC6713h60 runnableC6713h60) {
        super(runnableC6713h60, null);
        this.X = runnableC6713h60;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(L50 l50) {
        RunnableC6713h60 runnableC6713h60 = this.X;
        EnumC10183vH1 enumC10183vH1 = runnableC6713h60.X;
        RunnableC6713h60 runnableC6713h602 = l50.X;
        EnumC10183vH1 enumC10183vH12 = runnableC6713h602.X;
        if (enumC10183vH1 == enumC10183vH12) {
            return runnableC6713h60.Y - runnableC6713h602.Y;
        }
        return enumC10183vH12.ordinal() - enumC10183vH1.ordinal();
    }
}
