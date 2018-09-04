package sde.model;

import java.util.List;

public abstract class Process {
	private List<ItemQuantity> inputs;
	private List<ItemQuantity> outputs;
	private int baseTime;
	private IndustryActivity activity;

	protected Process(List<ItemQuantity> inputs, List<ItemQuantity> outputs, int baseTime, IndustryActivity activity) {
		this.inputs = inputs;
		this.outputs = outputs;
		this.baseTime = baseTime;
		this.activity = activity;
	}

	public IndustryActivity getActivity() {
		return activity;
	}

	public List<ItemQuantity> getInputs() {
		return inputs;
	}

	public List<ItemQuantity> getOutputs() {
		return outputs;
	}

	public int getBaseTime() {
		return baseTime;
	}
}
