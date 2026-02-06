package o;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class GH1 implements ThreadFactory {
    public final int a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable X;

        public a(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(GH1.this.a);
            } catch (Throwable unused) {
            }
            this.X.run();
        }
    }

    public GH1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
