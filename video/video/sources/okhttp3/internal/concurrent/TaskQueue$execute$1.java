package okhttp3.internal.concurrent;

import o.C7458kA2;
import o.FA0;
import o.InterfaceC8303na2;

@InterfaceC8303na2({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ FA0<C7458kA2> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, FA0<C7458kA2> fa0) {
        super(str, z);
        this.$block = fa0;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
