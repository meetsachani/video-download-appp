package o;

import android.view.View;
import android.widget.AdapterView;
import o.O4;

/* renamed from: o.Do1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2769Do1 implements AdapterView.OnItemSelectedListener {
    public final O4.e X;

    public C2769Do1(O4.e eVar) {
        this.X = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        O4.e eVar = this.X;
        if (eVar != null) {
            eVar.onNavigationItemSelected(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
