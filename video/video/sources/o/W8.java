package o;

import android.os.Looper;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class W8 implements InterfaceC9171r71 {
    @Override // o.InterfaceC9171r71
    @NotNull
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // o.InterfaceC9171r71
    @NotNull
    public AbstractC8922q71 b(@NotNull List<? extends InterfaceC9171r71> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new VF0(YF0.e(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // o.InterfaceC9171r71
    public int c() {
        return 1073741823;
    }
}
