package com.tencent.p177mm.p612ui;

import android.content.Context;
import android.support.p057v4.widget.C8415j;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.tencent.mm.ui.ListViewInScrollView */
public class ListViewInScrollView extends ListView {
    public ListViewInScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListViewInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        AppMethodBeat.m2504i(105983);
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(536870911, C8415j.INVALID_ID));
        AppMethodBeat.m2505o(105983);
    }
}
