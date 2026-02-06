package okhttp3.internal.concurrent;

import o.FA0;
import o.InterfaceC8303na2;

@InterfaceC8303na2({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ FA0<Long> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, FA0<Long> fa0) {
        super(str, false, 2, null);
        this.$block = fa0;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return this.$block.invoke().longValue();
    }
}
