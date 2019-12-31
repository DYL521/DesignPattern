// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.btObserver = Utils.findRequiredViewAsType(source, R.id.bt_observer, "field 'btObserver'", Button.class);
    target.btFactory = Utils.findRequiredViewAsType(source, R.id.bt_factory, "field 'btFactory'", Button.class);
    target.btSingleton = Utils.findRequiredViewAsType(source, R.id.bt_singleton, "field 'btSingleton'", Button.class);
    target.btStrategy = Utils.findRequiredViewAsType(source, R.id.bt_strategy, "field 'btStrategy'", Button.class);
    target.btAdapter = Utils.findRequiredViewAsType(source, R.id.bt_adapter, "field 'btAdapter'", Button.class);
    target.btCommand = Utils.findRequiredViewAsType(source, R.id.bt_command, "field 'btCommand'", Button.class);
    target.btDecorator = Utils.findRequiredViewAsType(source, R.id.bt_decorator, "field 'btDecorator'", Button.class);
    target.btFacade = Utils.findRequiredViewAsType(source, R.id.bt_facade, "field 'btFacade'", Button.class);
    target.btTemplateMethod = Utils.findRequiredViewAsType(source, R.id.bt_template_method, "field 'btTemplateMethod'", Button.class);
    target.btState = Utils.findRequiredViewAsType(source, R.id.bt_state, "field 'btState'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btObserver = null;
    target.btFactory = null;
    target.btSingleton = null;
    target.btStrategy = null;
    target.btAdapter = null;
    target.btCommand = null;
    target.btDecorator = null;
    target.btFacade = null;
    target.btTemplateMethod = null;
    target.btState = null;
  }
}
