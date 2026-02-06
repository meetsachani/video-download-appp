package o;

import androidx.work.WorkerParameters;

/* renamed from: o.ec2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC6096ec2 implements Runnable {
    public ZM2 X;
    public String Y;
    public WorkerParameters.a Z;

    public RunnableC6096ec2(ZM2 workManagerImpl, String workSpecId, WorkerParameters.a runtimeExtras) {
        this.X = workManagerImpl;
        this.Y = workSpecId;
        this.Z = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.X.J().l(this.Y, this.Z);
    }
}
