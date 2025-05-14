package com.devfalco.sistemaPagamento.desconto;

public class DescontoObserver implements IDesconto{
  protected IDesconto wrapDesconto;

  DescontoObserver(IDesconto dataDesconto){
    this.wrapDesconto = dataDesconto;
  }

  @Override
  public void descontar() {

  }
  
}
